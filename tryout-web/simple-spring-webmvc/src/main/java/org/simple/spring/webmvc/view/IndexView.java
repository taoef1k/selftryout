//package org.simple.spring.webmvc.view;
//
//import java.util.Map;
//import java.util.regex.Pattern;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.mixer2.jaxb.xhtml.Div;
//import org.mixer2.jaxb.xhtml.Html;
//import org.mixer2.spring.webmvc.AbstractMixer2XhtmlView;
//import org.mixer2.xhtml.PathAjuster;
//
//public class IndexView extends AbstractMixer2XhtmlView {
//    
//    @Override
//    protected Html renderHtml(Html html, Map<String, Object> model,
//            HttpServletRequest request, HttpServletResponse response)
//            throws Exception {
//        
//        String helloMessage = (String) model.get("helloMessage");
//
//        Div div = html.getById("message", Div.class);
//        div.unsetContent();
//        div.getContent().add(helloMessage);
//
//        // replace static file path
//        Pattern pattern = Pattern.compile("^\\.+/.*m2static/(.*)$");
//        String ctx = request.getContextPath();
//        PathAjuster.replacePath(html, pattern, ctx + "/m2static/$1");
//
//        return html;
//    }
//}