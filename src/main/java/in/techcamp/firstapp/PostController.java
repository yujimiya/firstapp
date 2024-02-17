package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PostController {
    @GetMapping("/hello")
    public String showHello(Model model){
        var sampleText = "サンプルテキスト";
        model.addAttribute("sampleText", sampleText);
        return "hello";
    }

    @GetMapping
//    データを作成し、ビューに渡せるようにする
    public String showList(Model model){
        var postList = List.of(
                new PostEntity(1, "投稿1"),
                new PostEntity(2, "投稿2"),
                new PostEntity(3, "投稿3")
        );
        model.addAttribute("postList", postList);
        return "index";
    }
}
