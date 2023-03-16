.class public Lw6/a;
.super Lw6/e;
.source ""


# static fields
.field private static final b:Lu6/a;


# instance fields
.field private final a:Lb7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lu6/a;->e()Lu6/a;

    move-result-object v0

    sput-object v0, Lw6/a;->b:Lu6/a;

    return-void
.end method

.method constructor <init>(Lb7/c;)V
    .locals 0

    invoke-direct {p0}, Lw6/e;-><init>()V

    iput-object p1, p0, Lw6/a;->a:Lb7/c;

    return-void
.end method

.method private g()Z
    .locals 3

    iget-object v0, p0, Lw6/a;->a:Lb7/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lw6/a;->b:Lu6/a;

    const-string v2, "ApplicationInfo is null"

    :goto_0
    invoke-virtual {v0, v2}, Lu6/a;->j(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-virtual {v0}, Lb7/c;->d0()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lw6/a;->b:Lu6/a;

    const-string v2, "GoogleAppId is null"

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lw6/a;->a:Lb7/c;

    invoke-virtual {v0}, Lb7/c;->b0()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lw6/a;->b:Lu6/a;

    const-string v2, "AppInstanceId is null"

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lw6/a;->a:Lb7/c;

    invoke-virtual {v0}, Lb7/c;->c0()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lw6/a;->b:Lu6/a;

    const-string v2, "ApplicationProcessState is null"

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lw6/a;->a:Lb7/c;

    invoke-virtual {v0}, Lb7/c;->a0()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lw6/a;->a:Lb7/c;

    invoke-virtual {v0}, Lb7/c;->X()Lb7/a;

    move-result-object v0

    invoke-virtual {v0}, Lb7/a;->W()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lw6/a;->b:Lu6/a;

    const-string v2, "AndroidAppInfo.packageName is null"

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lw6/a;->a:Lb7/c;

    invoke-virtual {v0}, Lb7/c;->X()Lb7/a;

    move-result-object v0

    invoke-virtual {v0}, Lb7/a;->X()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lw6/a;->b:Lu6/a;

    const-string v2, "AndroidAppInfo.sdkVersion is null"

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public c()Z
    .locals 2

    invoke-direct {p0}, Lw6/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lw6/a;->b:Lu6/a;

    const-string v1, "ApplicationInfo is invalid"

    invoke-virtual {v0, v1}, Lu6/a;->j(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
