modules = {
    application {
        resource url:'js/application.js'
    }
    plugins {
        resource url:'js/plugins.js'
    }
    script {
        resource url:'js/script.js'
    }
    orangebox{
        dependsOn 'jquerynew'
        resource id: 'orangebox', url: 'js/orangebox.min.js',
                disposition: 'head'

    }
    juvi{
        dependsOn 'jquerynew'
        resource id: 'juvi', url: 'js/libs/juvi/juvi_2.0_min.js',
                disposition: 'head'

    }
    anythingslider{
        dependsOn 'jquerynew'
        resource id: 'anythingslider', url: 'js/jquery.anythingslider.min.js',
                disposition: 'head'

    }
    jqprint{
        dependsOn 'jquerynew'
        resource id: 'jqprint', url: 'js/jquery.jqprint.js',
                disposition: 'head'

    }
    tiptip{
        dependsOn 'jquerynew'
        resource id: 'tiptip', url: 'js/libs/tiptip/jquery.tipTip.minified.js',
                disposition: 'head'

    }
    gritter{
        dependsOn 'jquerynew'
        resource id: 'gritter', url: 'js/jquery.gritter.min.js',
                disposition: 'head'

    }
    waypoints{
        dependsOn 'jquerynew'
        resource id: 'waypoints', url: 'js/libs/waypoints.min.js'


    }
    base64{

        resource id: 'base64', url: 'js/libs/base64.js',
                disposition: 'head'

    }
    canvas2image{
        dependsOn 'base64'
        resource id: 'canvas2image', url: 'js/libs/canvas2image.js',
                disposition: 'head'

    }

    jqwidgets{
        dependsOn 'jquerynew'
        resource id: 'jqwidgets', url: 'js/libs/jqwidgets/jqxcore.js',
                disposition: 'head'

    }
    jqwbuttons{
        dependsOn 'jqwidgets'
        resource id: 'jqwbuttons', url: 'js/libs/jqwidgets/jqxbuttons.js',
                disposition: 'head'

    }
    jqwtooltips{
        dependsOn 'jqwidgets'
        resource id: 'jqwtooltips', url: 'js/libs/jqwidgets/jqxtooltip.js',
                disposition: 'head'

    }
    jqwsplitter{
        dependsOn 'jqwidgets'
        resource id: 'jqwsplitter', url: 'js/libs/jqwidgets/jqxsplitter.js',
                disposition: 'head'

    }
    jqwtree{
        dependsOn 'jqwpanel'
        resource id: 'jqwtree', url: 'js/libs/jqwidgets/jqxtree.js',
                disposition: 'head'

    }
    jqwpanel{
        dependsOn 'jqwscrollbar'
        resource id: 'jqwpanel', url: 'js/libs/jqwidgets/jqxpanel.js',
                disposition: 'head'

    }
    jqwscrollbar{
        dependsOn 'jqwidgets'
        resource id: 'jqwscrollbar', url: 'js/libs/jqwidgets/jqxscrollbar.js',
                disposition: 'head'

    }
    jqwlistmenu{
        dependsOn 'jqwidgets'
        resource id: 'jqwlistmenu', url: 'js/libs/jqwidgets/jqxlistmenu.js',
                disposition: 'head'

    }

    jqwexpander{
        dependsOn 'jqwidgets'
        resource id: 'jqwexpander', url: 'js/libs/jqwidgets/jqxexpander.js',
                disposition: 'head'

    }
    jqwchart{
        dependsOn 'jqwidgets'
        resource id: 'jqwchart', url: 'js/libs/jqwidgets/jqxchart.js',
                disposition: 'head'

    }
    jqwdata{
        dependsOn 'jqwchart'
        resource id: 'jqwdata', url: 'js/libs/jqwidgets/jqxdata.js',
                disposition: 'head'

    }
    jqwtabs{
        dependsOn 'jqwidgets'
        resource id: 'jqwtabs', url: 'js/libs/jqwidgets/jqxtabs.js',
                disposition: 'head'

    }
    jqwindow{
        dependsOn 'jqwidgets'
        resource id: 'jqwindow', url: 'js/libs/jqwidgets/jqxwindow.js',
                disposition: 'head'

    }
    jqwdocking{
        dependsOn 'jqwindow'
        resource id: 'jqwdocking', url: 'js/libs/jqwidgets/jqxdocking.js',
                disposition: 'head'

    }
    jqwlistbox{
        dependsOn 'jqwscrollbar'
        resource id: 'jqwlistbox}', url: 'js/libs/jqwidgets/jqxlistbox.js',
                disposition: 'head'

    }

    autoSuggest{
        dependsOn 'jquerynew'
        resource id: 'autoSuggest}', url: 'js/libs/autoSuggest/jquery.autoSuggest.minified.js',
                disposition: 'head'

    }


    /*'jquery-theme' {
        resource id:'theme', url:[ dir: 'jquery-ui/css/ui-lightness',
                file:'jquery-ui-1.10.3.custom.min.css'],
                attrs:[media:'screen, projection']
    }



    'jquery-ui' {
        dependsOn 'jquerynew', 'jquery-theme'

        resource id:'js', url:[dir:'jquery-ui/js', file:'jquery-ui-1.10.3.custom.min.js'],
                nominify: true, disposition: 'head'
    }*/


    'jquerynew'{
        resource id: 'jqnewuery', url: 'jquery-ui/js/jquery-2.0.3.min.js', disposition: 'head'

    }
    jquerybrowserfix{
        dependsOn('jquerynew')
        resource id: 'jquerybrowserfix', url:'js/libs/jquery.mb.browser.min.js', disposition: 'head'
    }



}