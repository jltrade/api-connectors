package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.User;
import io.swagger.model.Affiliate;
import io.swagger.model.Transaction;
import io.swagger.model.UserCommission;
import io.swagger.model.AccessToken;
import io.swagger.model.Margin;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public abstract class UserApiService {
  
      public abstract Response userGet()
      throws NotFoundException;
  
      public abstract Response userUpdate(String firstname,String lastname,String oldPassword,String newPassword,String newPasswordConfirm,String username,String country,String pgpPubKey)
      throws NotFoundException;
  
      public abstract Response userNew(String email,String password,String country,String username,String firstname,String lastname,String acceptsTOS,String referrerID,String tfaType,String tfaToken)
      throws NotFoundException;
  
      public abstract Response userGetAffiliateStatus()
      throws NotFoundException;
  
      public abstract Response userCancelWithdrawal(String token)
      throws NotFoundException;
  
      public abstract Response userCheckReferralCode(String referralCode)
      throws NotFoundException;
  
      public abstract Response userGetCommission()
      throws NotFoundException;
  
      public abstract Response userConfirmEmail(String token)
      throws NotFoundException;
  
      public abstract Response userConfirmEnableTFA(String token,String type)
      throws NotFoundException;
  
      public abstract Response userConfirmPasswordReset(String token,String newPassword)
      throws NotFoundException;
  
      public abstract Response userConfirmWithdrawal(String token)
      throws NotFoundException;
  
      public abstract Response userGetDepositAddress(String currency)
      throws NotFoundException;
  
      public abstract Response userDisableTFA(String token,String type)
      throws NotFoundException;
  
      public abstract Response userLogin(String email,String password,String token)
      throws NotFoundException;
  
      public abstract Response userLogout()
      throws NotFoundException;
  
      public abstract Response userLogoutAll()
      throws NotFoundException;
  
      public abstract Response userGetMargin(String currency)
      throws NotFoundException;
  
      public abstract Response userSavePreferences(String prefs,Boolean overwrite)
      throws NotFoundException;
  
      public abstract Response userRequestEnableTFA(String type)
      throws NotFoundException;
  
      public abstract Response userRequestPasswordReset(String email)
      throws NotFoundException;
  
      public abstract Response userRequestWithdrawal(String currency,BigDecimal amount,String address,String otpToken,Double fee)
      throws NotFoundException;
  
      public abstract Response userSendVerificationEmail(String email)
      throws NotFoundException;
  
      public abstract Response userGetWalletHistory(String currency)
      throws NotFoundException;
  
}
