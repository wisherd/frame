//package com.cloud.zuul.service.impl;
//
//import com.cloud.zuul.common.vo.MenuVo;
//import com.cloud.zuul.feign.MenuServiceClient;
//import com.cloud.zuul.service.PermissionService;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Service;
//import org.springframework.util.AntPathMatcher;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.List;
//import java.util.Set;
//
///**
// * @author summer
// * @date 2017/10/28
// */
//@Service("permissionService")
//public class PermissionServiceImpl implements PermissionService {
//  @Autowired private MenuServiceClient menuServiceClient;
//
//  private AntPathMatcher antPathMatcher = new AntPathMatcher();
//
//  @Override
//  public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
//    // ele-admin options 跨域配置，现在处理是通过前端配置代理，不使用这种方式，存在风险
//    //        if (HttpMethod.OPTIONS.name().equalsIgnoreCase(request.getMethod())) {
//    //            return true;
//    //        }
//    Object principal = authentication.getPrincipal();
//    List<SimpleGrantedAuthority> grantedAuthorityList =
//        (List<SimpleGrantedAuthority>) authentication.getAuthorities();
//    boolean hasPermission = false;
//
//    if (principal != null) {
//      Set<MenuVo> urls =
//          menuServiceClient.findMenuByRole(grantedAuthorityList.get(0).getAuthority());
//      for (MenuVo menu : urls) {
//        if (StringUtils.isNotEmpty(menu.getUrl())
//            && antPathMatcher.match(menu.getUrl(), request.getRequestURI())
//            && request.getMethod().equalsIgnoreCase(menu.getMethod())) {
//          hasPermission = true;
//          break;
//        }
//      }
//    }
//    return hasPermission;
//  }
//}
