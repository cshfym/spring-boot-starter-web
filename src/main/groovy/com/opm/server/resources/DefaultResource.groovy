package com.opm.server.resources

import com.opm.server.models.BasicResponse
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import org.springframework.web.bind.annotation.ResponseBody

@Slf4j
@Controller
@RequestMapping("/")
class DefaultResource {

    //@Autowired
    //RedisConnectionService redisConnectionService

    @ResponseBody
    @RequestMapping(method=RequestMethod.GET)
    static BasicResponse applicationDefault() {
        new BasicResponse(success: true, message: "Default resource. This URI does nothing.")
    }

    /*
    @ResponseBody
    @RequestMapping(value="/setcache", method=RequestMethod.GET)
    BasicResponse setCache(@RequestParam(value="key") String key, @RequestParam(value="value") String value) {

        try {
            redisConnectionService.setCache(key, value)
        } catch (Exception ex) {
            ex.printStackTrace()
            log.error("Exception trying to set cache with key [${key}]", ex)
        }

        new BasicResponse(success: true)
    }

    @ResponseBody
    @RequestMapping(value="/getcache", method=RequestMethod.GET)
    BasicResponse getCache(@RequestParam(value="key") String key) {

        String value = redisConnectionService.getFromCache(key)

        new BasicResponse(success: true, message: "Fetched cache value: [${value}]")
    }
    */
}