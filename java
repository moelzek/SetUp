For upload to EGA, need to encrypt using EGAcryptor:
https://ega-archive.org/submission/tools/egacryptor#InstallClient

As part of this, need to download Unlimited Strength Jurisdiction Policy Files:
http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html

And place following files in jre directory @
~/cgat-install/conda-install/envs/py36-v1/jre/lib/security

US_export_policy.jar
local_policy.jar




