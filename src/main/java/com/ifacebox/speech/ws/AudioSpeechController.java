package com.ifacebox.speech.ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author znn
 */
@Controller
public class AudioSpeechController {

    @GetMapping({"/", "/speech"})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("speech/index");
        return modelAndView;
    }
}
