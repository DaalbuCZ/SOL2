.class public final Lr9/q0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Z

.field private static final b:Lr9/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlinx/coroutines/internal/f0;->e(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lr9/q0;->a:Z

    invoke-static {}, Lr9/q0;->b()Lr9/r0;

    move-result-object v0

    sput-object v0, Lr9/q0;->b:Lr9/r0;

    return-void
.end method

.method public static final a()Lr9/r0;
    .locals 1

    sget-object v0, Lr9/q0;->b:Lr9/r0;

    return-object v0
.end method

.method private static final b()Lr9/r0;
    .locals 2

    sget-boolean v0, Lr9/q0;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Lr9/p0;->u:Lr9/p0;

    return-object v0

    :cond_0
    invoke-static {}, Lr9/x0;->c()Lr9/z1;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/internal/w;->c(Lr9/z1;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, Lr9/r0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, Lr9/r0;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Lr9/p0;->u:Lr9/p0;

    :goto_1
    return-object v0
.end method
