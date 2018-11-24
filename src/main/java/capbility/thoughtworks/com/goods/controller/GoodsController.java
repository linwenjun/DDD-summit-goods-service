package capbility.thoughtworks.com.goods.controller;

import capbility.thoughtworks.com.goods.entity.Goods;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/goods")
@RestController
public class GoodsController {

    private List<Goods> goodsList = Arrays.asList(
            Goods.builder().id(1L).name("小米Mix3").build(),
            Goods.builder().id(2L).name("Iphone XS").build()
    );

    @GetMapping()
    public List<Goods> getGoods() {
        return goodsList;
    }

    @GetMapping("/{id}")
    public Goods getGoodsById(@PathVariable Long id) {
        return goodsList.get(0);
    }
}
