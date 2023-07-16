//package com.progresssoft.fxdeals;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.progresssoft.fxdeals.DTO.DealRequestDto;
//import com.progresssoft.fxdeals.controller.DealController;
//import com.progresssoft.fxdeals.entity.DealEntity;
//import com.progresssoft.fxdeals.interfaces.DealService;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.math.BigDecimal;
//
//import static org.mockito.Mockito.*;
//import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(MockitoJUnitRunner.class)
//public class DealControllerTest {
//
//    @InjectMocks
//    private DealController dealController;
//
//    @Mock
//    private DealService dealService;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(dealController).build();
//    }
//
//    @Test
//    public void testCreateDeal_ValidInput() throws Exception {
//        DealRequestDto dto = new DealRequestDto();
//        dto.setFromCurrency("JOD");
//        dto.setToCurrency("USD");
//        dto.setAmount(BigDecimal.valueOf(100));
//
//        DealEntity createdDeal = new DealEntity();
//        createdDeal.setAmount(dto.getAmount());
//        createdDeal.setToCurrency(dto.getFromCurrency());
//        when(dealService.create(dto)).thenReturn(createdDeal);
//
//        mockMvc.perform(post("/api/v1/deals")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(dto)))
//                .andExpect(status().isCreated());
//
//        verify(dealService, times(1)).create(dto);
//    }
//
//    @Test
//    public void testCreateDeal_InvalidInput() throws Exception {
//        DealRequestDto dto = new DealRequestDto();
//        dto.setFromCurrency("JO");
//        dto.setToCurrency("USD");
//        dto.setAmount(BigDecimal.valueOf(100));
//
//        mockMvc.perform(post("/api/v1/deals")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(dto)))
//                .andExpect(status().isBadRequest());
//
//        verifyNoInteractions(dealService);
//    }
//}
