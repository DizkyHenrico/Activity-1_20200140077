
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

@Controller

public class ProjectControler {
    
    @RequestMapping("/table")
    public String gateTable (Model Data) {
        
      ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
        data.add(Arrays.asList("001","11111","nopal","jl.mawar"));
        data.add(Arrays.asList("002","11112","raki","jl.sudirman"));
        data.add(Arrays.asList("003","11113","dini","jl.Hariono"));
        data.add(Arrays.asList("004","11114","ruki","jl.Sejahtera"));
        data.add(Arrays.asList("005","11115","eko","jl.cendana"));
        data.add(Arrays.asList("006","11116","mukti","jl.kentungan"));
        data.add(Arrays.asList("007","11117","yudi","jl.Telinga"));
        data.add(Arrays.asList("008","11118","indri","jl.regal"));
        data.add(Arrays.asList("009","11119","kia","jl.kaliopak"));
        data.add(Arrays.asList("010","11110","muji","jl.sulaiman"));
        data.add(Arrays.asList("011","11111","tito","jl.imambonjol"));
        data.add(Arrays.asList("012","11112","putu","jl.emas"));
        data.add(Arrays.asList("013","11113","endri","jl.kalikulon"));
        data.add(Arrays.asList("014","11114","bagus","jl.kaliabu"));
       
        
        Data.addAttribute("tabel",data);
        return "tabelview";
    }
    
}