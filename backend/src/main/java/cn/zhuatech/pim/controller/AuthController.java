/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.pim.controller;
import cn.zhuatech.pim.common.ApiResponse; import cn.zhuatech.pim.dto.AuthDto.*; import cn.zhuatech.pim.repository.UserRepository; import cn.zhuatech.pim.security.JwtService; import cn.zhuatech.pim.service.CurrentUserService; import jakarta.validation.Valid; import org.springframework.security.authentication.*; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/auth") public class AuthController {
    private final AuthenticationManager auth;private final JwtService jwt;private final UserRepository users;private final CurrentUserService current;
    public AuthController(AuthenticationManager auth,JwtService jwt,UserRepository users,CurrentUserService current){this.auth=auth;this.jwt=jwt;this.users=users;this.current=current;}
    @PostMapping("/login") public ApiResponse<LoginResponse> login(@Valid @RequestBody LoginRequest request){auth.authenticate(new UsernamePasswordAuthenticationToken(request.username(),request.password()));var user=users.findByUsername(request.username()).orElseThrow();return ApiResponse.ok("登录成功",new LoginResponse(jwt.generate(user.getUsername()),UserView.from(user)));}
    @GetMapping("/me") public ApiResponse<UserView> me(){return ApiResponse.ok(UserView.from(current.get()));}
}
