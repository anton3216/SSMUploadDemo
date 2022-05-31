package org.qingqiao.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class FileUpload {
    public static String fileupload(MultipartFile uploadfile, HttpServletRequest request){
        SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
        String format = sdf.format(new Date());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> format:\t" + format);
        String realPath = request.getServletContext().getRealPath("/img") + format;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> realPath:\t" + realPath);
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = uploadfile.getOriginalFilename();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> oldName:\t" + oldName);
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> newName:\t" + newName);
        try {
            uploadfile.transferTo(new File(folder, newName));
            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/img" + format + newName;
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> url:\t" + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "img" + format + newName;
    }
}
