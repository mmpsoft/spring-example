package com.maguasoft.spring.imports.selector;

import com.maguasoft.spring.imports.UserService;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ClassImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{UserService.class.getName()};
    }
}
