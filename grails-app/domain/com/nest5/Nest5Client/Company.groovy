package com.nest5.Nest5Client

class Company extends SecUser {

    static belongsTo = [category: Category]
    static hasMany = [managedStores:Store,managedPromos: Promo,clients: Relation,chats: Message]
    static mappedBy = [managedStores:"company",managedPromos:"company"]
    String name
    String address
    String telephone
    String contactName
    String email
    String nit
    String logo = ""
    String url = "http://"
    Date registerDate
    Boolean active = true




    List clients() {
        return clients.collect{it.user}
    }

    List chats() {
        return chats.collect{it.user}
    }

    List lazyPromos(offset,limit)
    {
        def lista = this.managedPromos.collect()
        lista.sort({it.createdAt})
        def size = lista.size()
        if(limit > size)
        {
            limit = size
        }
        if(offset > size)
        {
            offset =  size
        }

        def nueva = lista.subList(offset,limit)


        return nueva
    }
    List addToUser(User user) {
        Relation.link(this,user)
        return clients()
    }

    List addToChat(User user, String message) {
        Message.addLine(this,user,message,2)
        return chats()
    }

    List removeFromUser(User user) {
        Relation.unlink(this,user)
        return clients()
    }


    static constraints = {

    }

    String toString(){
        name
    }
}
