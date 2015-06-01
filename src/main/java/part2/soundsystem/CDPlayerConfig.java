package part2.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
    If the @ComponentScan annotation does not have any parameter, it will enable @Component scanning within the current package(soundsystem).
    But you can explicitly mention the package to scan.

    The equivalent xml configuration would have to contain the following:
    <context:component-scan base-package="soundsystem" />
*/

@Configuration
@ComponentScan(basePackages = "part2.soundsystem") //Alternatives: @ComponentScan @ComponentScan("part2.sountsystem") @ComponentScan(basePackageClasses=CompactDisk.class)
public class CDPlayerConfig {

}
