.class public final Lv7/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll8/k$c;
.implements Lc8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/a$a;
    }
.end annotation


# static fields
.field public static final p:Lv7/a$a;


# instance fields
.field private n:Landroid/content/Context;

.field private o:Ll8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv7/a$a;-><init>(Lk9/g;)V

    sput-object v0, Lv7/a;->p:Lv7/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a([B)Ljava/lang/String;
    .locals 7

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    array-length v1, p1

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [C

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget-byte v5, p1, v3

    and-int/lit16 v5, v5, 0xff

    mul-int/lit8 v3, v3, 0x2

    ushr-int/lit8 v6, v5, 0x4

    aget-char v6, v0, v6

    aput-char v6, v1, v3

    add-int/lit8 v3, v3, 0x1

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v0, v5

    aput-char v5, v1, v3

    move v3, v4

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>([C)V

    return-object p1

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method private final b(Landroid/content/pm/PackageManager;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lv7/a;->n:Landroid/content/Context;

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x8000000

    invoke-virtual {p1, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/pm/SigningInfo;->hasMultipleSigners()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/content/pm/SigningInfo;->getApkContentsSigners()[Landroid/content/pm/Signature;

    move-result-object p1

    const-string v1, "signingInfo.apkContentsSigners"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lz8/b;->i([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/Signature;

    invoke-virtual {p1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p1

    const-string v1, "signingInfo.apkContentsS\u2026ers.first().toByteArray()"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lv7/a;->d([B)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/content/pm/SigningInfo;->getSigningCertificateHistory()[Landroid/content/pm/Signature;

    move-result-object p1

    const-string v1, "signingInfo.signingCertificateHistory"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lz8/b;->i([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/Signature;

    invoke-virtual {p1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p1

    const-string v1, "signingInfo.signingCerti\u2026ory.first().toByteArray()"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lv7/a;->d([B)Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v0, p1

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lv7/a;->n:Landroid/content/Context;

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {p1, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_4

    array-length v3, p1

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_1

    :cond_3
    move v3, v1

    :goto_1
    if-eqz v3, :cond_5

    :cond_4
    move v1, v2

    :cond_5
    if-nez v1, :cond_7

    const-string v1, "packageInfo.signatures"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lz8/b;->i([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const-string v1, "signatures"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lz8/b;->i([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/Signature;

    invoke-virtual {p1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p1

    const-string v1, "signatures.first().toByteArray()"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lv7/a;->d([B)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_7
    :goto_2
    return-object v0
.end method

.method private final c(Landroid/content/pm/PackageInfo;)J
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v0, p1

    :goto_0
    return-wide v0
.end method

.method private final d([B)Ljava/lang/String;
    .locals 1

    const-string v0, "SHA1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    const-string v0, "hashText"

    invoke-static {p1, v0}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lv7/a;->a([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lv7/a;->n:Landroid/content/Context;

    new-instance v0, Ll8/k;

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object p1

    const-string v1, "dev.fluttercommunity.plus/package_info"

    invoke-direct {v0, p1, v1}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lv7/a;->o:Ll8/k;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lv7/a;->n:Landroid/content/Context;

    iget-object v0, p0, Lv7/a;->o:Ll8/k;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll8/k;->e(Ll8/k$c;)V

    iput-object p1, p0, Lv7/a;->o:Ll8/k;

    return-void
.end method

.method public onMethodCall(Ll8/j;Ll8/k$d;)V
    .locals 6

    const-string v0, "call"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object p1, p1, Ll8/j;->a:Ljava/lang/String;

    const-string v0, "getAll"

    invoke-static {p1, v0}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lv7/a;->n:Landroid/content/Context;

    invoke-static {p1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iget-object v0, p0, Lv7/a;->n:Landroid/content/Context;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    const-string v1, "packageManager"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lv7/a;->b(Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lv7/a;->n:Landroid/content/Context;

    invoke-static {v2}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, "appName"

    iget-object v5, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v5, p1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "packageName"

    iget-object v4, p0, Lv7/a;->n:Landroid/content/Context;

    invoke-static {v4}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "version"

    iget-object v4, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "buildNumber"

    const-string v4, "info"

    invoke-static {v0, v4}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lv7/a;->c(Landroid/content/pm/PackageInfo;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_0

    const-string p1, "buildSignature"

    invoke-virtual {v3, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz v2, :cond_1

    const-string p1, "installerStore"

    invoke-virtual {v3, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {p2, v3}, Ll8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, Ll8/k$d;->c()V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "Name not found"

    invoke-interface {p2, v1, p1, v0}, Ll8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method