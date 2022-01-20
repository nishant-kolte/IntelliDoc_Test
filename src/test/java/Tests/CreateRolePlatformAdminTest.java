package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class CreateRolePlatformAdminTest extends BasePage
{
    @Test
    public void CreateRolePlatformAdminFlow() throws InterruptedException, IOException
    {
        try {
            BasePage.LoginTest();
            CreateRolePage CreateRolePageObj = new CreateRolePage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            CreateRolePageObj.ClickRoleManagementBtn();
            Thread.sleep(5000);
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//Role button clicked.jpg");
            Thread.sleep(2000);
            System.out.println("Role button clicked");
            // Blank RoleName and Blank permission
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankRoleNameCreated.jpg");
            System.out.println("Assert Verified Please check form data and permission cannot be empty");
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            // Valid RoleName and Blank permission
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//ValidName_BLankPermissionRole.jpg");
            System.out.println("Assert Verified Permissions cannot be blank");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            Robot r = new Robot();

            //  Blank RoleName and Valid Permission
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankName_ValidPermission.jpg");
            System.out.println(" Assert verified Please check form data");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

         /*   // Create AE admin role
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("AdminRole"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectCreateUserPermission();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateProject();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewUser();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateProject();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateUser();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateTemplate();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewAnalytics();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            System.out.println("Role with valid rolename valid permission");
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);
*/

            // Create AE supervisor Role
        /*    CreateRolePageObj.EnterRoleName(ReadProps.readAttr("SupervisorRole"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateTemplate();
            Thread.sleep(1000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            System.out.println("Role with valid rolename valid permission");
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);*/

           /* //Create AE Operator Role
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("OperatorRole"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            System.out.println("Role with valid rolename valid permission");
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);*/

            // Valid Role with Valid Name and Permission.
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//RoleCreatedSuccessfully.jpg");
            System.out.println("Role Created Successfully");
            Thread.sleep(5000);

            // Repeated Role Doesn't allow repeat role
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//RepeatedRole.jpg");
            System.out.println(" Assertion verified Role exist with name AE Admin");
            Thread.sleep(4000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

            // TC 1.5 - Search role
            CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleNamePA"));
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//SearchRole.jpg");
            Thread.sleep(3000);
            System.out.println("Role searched");

            //Update Role with Valid Data
            CreateRolePageObj.ClickEditRole1();
            Thread.sleep(5000);
            CreateRolePageObj.ClickRemovePermission();
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//UpdateRole.jpg");
            Thread.sleep(3000);
            //CreateRolePageObj.UpdateTimeAssert();
            //Thread.sleep(2000);

            //Remove all permission
            CreateRolePageObj.ClickEditRole1();
            Thread.sleep(5000);
            CreateRolePageObj.ClickRemovePermission();
            Thread.sleep(2000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankPermission.jpg");
            Thread.sleep(2000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

            //Disable the Status of role and update
            CreateRolePageObj.ClickEditRole1();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//ActiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(4000);

            //Enable the Status of role and update
            CreateRolePageObj.ClickEditRole1();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//InactiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(3000);
            CreateRolePageObj.ClickLogout();
            Thread.sleep(5000);
            driver.close();
            CreateRolePageObj.AssertAll();
        }
        catch (Exception e)
        {
            test.log(status.FAIL, e);
        }
    }
}
