package capbility.thoughtworks.com.goods;

import capbility.thoughtworks.com.goods.controller.GoodsController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

public class GoodsBase {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new GoodsController());
    }
}
