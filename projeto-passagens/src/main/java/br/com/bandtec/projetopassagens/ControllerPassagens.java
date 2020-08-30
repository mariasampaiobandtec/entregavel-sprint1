package br.com.bandtec.projetopassagens;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/passagens")
public class ControllerPassagens {

    private List<Passagem> listPassagens = new ArrayList<>();

    private boolean verificacao = true;

    // POST - Cadastrar PassagemIda
    @PostMapping("/cadastrar/ida")
    public void cadastrarPassagemIda(@RequestBody PassagemIda pi) {
        listPassagens.add(pi);
    }

    // POST - Cadastrar PassagemVolta
    @PostMapping("/cadastrar/volta")
    public void cadastrarPassagemVolta(@RequestBody PassagemVolta pv) {
        listPassagens.add(pv);
    }

    // GET - Exibir passagens
    @GetMapping("/{tipoPassagem}")
    public List<Passagem> listarPassagens(@PathVariable String tipoPassagem) {


        if (verificacao == true) {

            listPassagens.add(new PassagemIda("Maria Sampaio", "5006", 8070, "GRU", "FOR", 3, 1,
                    1, 9, "Premium", 1200.00, 3));
            listPassagens.add(new PassagemVolta("Maria Sampaio", "5006", 6070, "FOR", "GRU", 3, 1,
                    3, 10, "Premium", 1300.00, 3));

            verificacao = false;
        }

        List<Passagem> pa = new ArrayList<>();

        if (tipoPassagem.equals("ida")) {
            for (Passagem p : listPassagens) {
                if (p instanceof PassagemIda) {
                    pa.add(p);
                }
            }
        } else if (tipoPassagem.equals("volta")) {
            for (Passagem p : listPassagens) {
                if (p instanceof PassagemVolta) {
                    pa.add(p);
                }

            }
        }

        return pa;

    }

    // DELETE - Excluir uma passagem
    @DeleteMapping("/excluir/{id}")
    public void excluirPassagem(@PathVariable int id) {
        listPassagens.remove(id - 1);
    }
}

