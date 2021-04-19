package us.deans.projects.income_analyzer_sb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;
import us.deans.core.IncomeAnalyzer.IncomeAnalyzer_Engine_001;
import us.deans.core.IncomeAnalyzer.IncomeAnalyzer_Model;

import javax.servlet.*;
import java.io.IOException;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/getReport")
@SessionAttributes("assessment")
public class AssessmentController {

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model){
        return null;
    }

    public ModelAndView getReport() throws ServletException, IOException {

        //assume we will need the backend...
        us.deans.core.IncomeAnalyzer.IncomeAnalyzer_Model model = new IncomeAnalyzer_Model();
        us.deans.core.IncomeAnalyzer.IncomeAnalyzer_Engine_001 engine = new IncomeAnalyzer_Engine_001();
        model.setIaEngine(engine);



        // get form data
        ServletRequest request = null;
        request.setAttribute("income", model);





        // forward the request to the JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("/IncomeAnalyser_View.jsp");
        ServletResponse response = null;
        dispatcher.forward(request, response);

        var params = new HashMap<String, Object>();
        return new ModelAndView("showReport",params);

    }

}
