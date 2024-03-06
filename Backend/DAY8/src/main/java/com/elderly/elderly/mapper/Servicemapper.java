// package com.elderly.elderly.mapper;

// import com.elderly.elderly.dto.Servicedto;
// import com.elderly.elderly.entity.Serviceentity;

// public class Servicemapper {
//     public static Servicedto maptoEmployeeDto(Serviceentity serviceentity) {
//         return new Servicedto(
//             serviceentity.getId(),
//             serviceentity.getName(),
//             serviceentity.getProvider(),
//             serviceentity.getDescription(),
//             serviceentity.getCharges(),
//             serviceentity.getTiming());
//     }

//     public static Serviceentity maptoEmployee(Servicedto servicedto) {
//         return new Serviceentity(
//             servicedto.getId(),
//             servicedto.getName(),
//             servicedto.getProvider(),
//             servicedto.getDescription(),
//             servicedto.getCharges(),
//             servicedto.getTiming());
//     }
// }



package com.elderly.elderly.mapper;

import com.elderly.elderly.dto.Servicedto;
import com.elderly.elderly.entity.Serviceentity;

public class Servicemapper {

    public static Servicedto maptoServicedto(Serviceentity serviceentity) {
        // Implement the mapping logic
        return new Servicedto(
                serviceentity.getId(),
                serviceentity.getName(),
                serviceentity.getProvider(),
                serviceentity.getDescription(),
                serviceentity.getCharges(),
                serviceentity.getTiming()
        );
    }

    public static Serviceentity maptoServiceentity(Servicedto servicedto) {
        // Implement the mapping logic
        return new Serviceentity(
                servicedto.getId(),
                servicedto.getName(),
                servicedto.getProvider(),
                servicedto.getDescription(),
                servicedto.getCharges(),
                servicedto.getTiming()
        );
    }
}
