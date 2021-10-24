package com.niit.niitspringproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String message(Model model) {	
		return "index";
	}
	@GetMapping("/shop")
	public String viewShopPage() {	
		return "shop";
	}

	@GetMapping("/cart")
	public String viewCartPage() {	
		return "cart";
	}
	
	@GetMapping("/checkout")
	public String viewChecoutPage() {	
		return "checkout";
	}

	@GetMapping("/contact")
	public String viewContactPage() {	
		return "contact";
	}

	@GetMapping("/detail")
	public String viewDetailPage() {	
		return "detail";
	}
	@GetMapping("/sac")
	public String viewSacPage() {	
		return "sac";
	}

    @GetMapping("/ceinture")
    public String viewceinturePage() {	
	return "ceinture";
}
    @GetMapping("/Shoes")
    public String viewShoesPage() {	
	return "Shoes";
}
    @GetMapping("/Pierre")
    public String viewPierrePage() {	
	return "Pierre";
}
    @GetMapping("/Ornement")
    public String viewOrnementPage() {	
	return "Ornement";
}

    @GetMapping("/Montre")
    public String viewMontrePage() {	
	return "Montre";
}
    @GetMapping("/Login")
    public String viewLoginPage() {	
	return "Login";
}
    @GetMapping("/Inscription")
    public String viewInscriptionPage() {	
	return "Inscription";
}


}
