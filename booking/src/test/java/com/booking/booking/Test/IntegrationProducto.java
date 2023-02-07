package com.booking.booking.Test;

import com.booking.booking.controllers.ProductoController;
import com.booking.booking.entities.Producto;
import com.booking.booking.services.ProductoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.chrono.ChronoLocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class IntegrationProducto {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ProductoService productoService;

    private void cargarDatos(){
//        Producto productoCargado= productoService.post(new Producto(4.5,"Bello",,"04:00",
//                "Natacion","Clase de natacion"));
    }

    @Test
    public void getAllTest()throws Exception{
        cargarDatos();
        MvcResult result=mockMvc.perform
                        (MockMvcRequestBuilders.get("/api/producto").accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        assertFalse(result.getResponse().getContentAsString().isEmpty());
    }

    @Test
    public void getOneTest()throws Exception{
        cargarDatos();
        MvcResult result=mockMvc.perform
                        (MockMvcRequestBuilders.get("/api/categorias/1").accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        assertFalse(result.getResponse().getContentAsString().isEmpty());
    }

    @Test
    public void deleteID()throws Exception{
        cargarDatos();
        MvcResult result=mockMvc.perform
                        (MockMvcRequestBuilders.delete("/api/categorias/1").accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        assertFalse(result.getResponse().getContentAsString().isEmpty());
    }
}
