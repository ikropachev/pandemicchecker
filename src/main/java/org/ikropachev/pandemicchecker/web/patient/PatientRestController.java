package org.ikropachev.pandemicchecker.web.patient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.ikropachev.pandemicchecker.model.Patient;
import org.ikropachev.pandemicchecker.service.PatientService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
@RequestMapping(value = PatientRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(description = "Operations for patients from admin")
public class PatientRestController {
    private static final Logger log = getLogger(PatientRestController.class);
    static final String REST_URL = "/rest/patients";

    @Autowired
    private PatientService service;

    @GetMapping
    @ApiOperation(value = "View a list of all patients")
    public List<Patient> getAll() {
        log.info("get all restaurants");
        return service.getAll();
    }
}
