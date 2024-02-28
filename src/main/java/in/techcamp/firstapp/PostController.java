package in.techcamp.firstapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;

    @GetMapping("/hello")
    public  String showHello(Model model){
        var sampleText = "サンプルテキスト";
        model.addAttribute("sampleText", sampleText);
        return "hello";
    }

    @GetMapping
    public String showList(Model model){
        var postList = postRepository.findAll();
        model.addAttribute("postList", postList);
        return "index";
    }
}