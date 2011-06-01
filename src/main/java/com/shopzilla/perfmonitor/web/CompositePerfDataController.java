package com.shopzilla.perfmonitor.web;

import com.shopzilla.perfmonitor.data.CompositePerfData;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "compositeperfdatas", formBackingObject = CompositePerfData.class)
@RequestMapping("/compositeperfdatas")
@Controller
public class CompositePerfDataController {
}
