.class public final Lr9/x1;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lkotlinx/coroutines/internal/e0;

.field public static final b:Lkotlinx/coroutines/internal/e0;

.field private static final c:Lkotlinx/coroutines/internal/e0;

.field private static final d:Lkotlinx/coroutines/internal/e0;

.field private static final e:Lkotlinx/coroutines/internal/e0;

.field private static final f:Lr9/z0;

.field private static final g:Lr9/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/e0;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr9/x1;->a:Lkotlinx/coroutines/internal/e0;

    new-instance v0, Lkotlinx/coroutines/internal/e0;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr9/x1;->b:Lkotlinx/coroutines/internal/e0;

    new-instance v0, Lkotlinx/coroutines/internal/e0;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr9/x1;->c:Lkotlinx/coroutines/internal/e0;

    new-instance v0, Lkotlinx/coroutines/internal/e0;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr9/x1;->d:Lkotlinx/coroutines/internal/e0;

    new-instance v0, Lkotlinx/coroutines/internal/e0;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr9/x1;->e:Lkotlinx/coroutines/internal/e0;

    new-instance v0, Lr9/z0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr9/z0;-><init>(Z)V

    sput-object v0, Lr9/x1;->f:Lr9/z0;

    new-instance v0, Lr9/z0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr9/z0;-><init>(Z)V

    sput-object v0, Lr9/x1;->g:Lr9/z0;

    return-void
.end method

.method public static final synthetic a()Lkotlinx/coroutines/internal/e0;
    .locals 1

    sget-object v0, Lr9/x1;->a:Lkotlinx/coroutines/internal/e0;

    return-object v0
.end method

.method public static final synthetic b()Lkotlinx/coroutines/internal/e0;
    .locals 1

    sget-object v0, Lr9/x1;->c:Lkotlinx/coroutines/internal/e0;

    return-object v0
.end method

.method public static final synthetic c()Lr9/z0;
    .locals 1

    sget-object v0, Lr9/x1;->g:Lr9/z0;

    return-object v0
.end method

.method public static final synthetic d()Lr9/z0;
    .locals 1

    sget-object v0, Lr9/x1;->f:Lr9/z0;

    return-object v0
.end method

.method public static final synthetic e()Lkotlinx/coroutines/internal/e0;
    .locals 1

    sget-object v0, Lr9/x1;->e:Lkotlinx/coroutines/internal/e0;

    return-object v0
.end method

.method public static final synthetic f()Lkotlinx/coroutines/internal/e0;
    .locals 1

    sget-object v0, Lr9/x1;->d:Lkotlinx/coroutines/internal/e0;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lr9/k1;

    if-eqz v0, :cond_0

    new-instance v0, Lr9/l1;

    check-cast p0, Lr9/k1;

    invoke-direct {v0, p0}, Lr9/l1;-><init>(Lr9/k1;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method
