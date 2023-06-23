package com.mycompany.group234.function;

import com.mycompany.group234.model.Document;
import com.mycompany.group234.model.SiteMap;
import com.mycompany.group234.model.FETechnology;
import com.mycompany.group234.model.Capability;
import com.mycompany.group234.model.Industry;
import com.mycompany.group234.model.GitHubCreds;
import com.mycompany.group234.model.User;
import com.mycompany.group234.model.Settings;
import com.mycompany.group234.model.FrontendApp;
import com.mycompany.group234.model.BackendApp;
import com.mycompany.group234.model.ScreenFlow;
import com.mycompany.group234.model.ScreenFeature;
import com.mycompany.group234.model.Database;
import com.mycompany.group234.model.Project;
import com.mycompany.group234.model.ModelFile;
import com.mycompany.group234.model.FrontendScreen;
import com.mycompany.group234.model.Theme;
import com.mycompany.group234.model.BETechnology;
import com.mycompany.group234.model.complex.BasicDetails;
import com.mycompany.group234.enums.IndustryType;
import com.mycompany.group234.enums.ModelType;
import com.mycompany.group234.enums.ModelCreator;
import com.mycompany.group234.converter.IndustryTypeConverter;
import com.mycompany.group234.converter.ModelTypeConverter;
import com.mycompany.group234.converter.ModelCreatorConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.UserRepository;
import com.mycompany.group234.repository.CapabilityRepository;
import com.mycompany.group234.repository.BETechnologyRepository;
import com.mycompany.group234.repository.DocumentRepository;
import com.mycompany.group234.repository.BackendAppRepository;
import com.mycompany.group234.repository.IndustryRepository;
import com.mycompany.group234.repository.ScreenFlowRepository;
import com.mycompany.group234.repository.ScreenFeatureRepository;
import com.mycompany.group234.repository.ProjectRepository;
import com.mycompany.group234.repository.FrontendScreenRepository;
import com.mycompany.group234.repository.SiteMapRepository;
import com.mycompany.group234.repository.ModelFileRepository;
import com.mycompany.group234.repository.DatabaseRepository;
import com.mycompany.group234.repository.ThemeRepository;
import com.mycompany.group234.repository.FETechnologyRepository;
import com.mycompany.group234.repository.FrontendAppRepository;
import com.mycompany.group234.repository.SettingsRepository;
import com.mycompany.group234.repository.GitHubCredsRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
