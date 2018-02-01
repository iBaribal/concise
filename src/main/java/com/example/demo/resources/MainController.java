package com.example.demo.resources;

import com.example.demo.model.Data;
import com.example.demo.repository.DataRepsitory;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/data")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MainController {

    @Autowired
    private DataRepsitory dataRepsitory;

    @GET
    public Response getData(@QueryParam("search") String customer) {
        ArrayList<Data> data = Lists.newArrayList(dataRepsitory.findByCustomer(customer));
        return Response.ok(data).build();
    }

    @POST
    public Response insertData(Data data) {
        dataRepsitory.save(data);
        return Response.ok().build();
    }
}
