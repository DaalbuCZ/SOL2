.class public final Lkotlinx/coroutines/internal/i0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lkotlinx/coroutines/internal/e0;

.field private static final b:Lr9/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/p<",
            "Ljava/lang/Object;",
            "Lj9/g$b;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lr9/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/p<",
            "Lz9/f2<",
            "*>;",
            "Lj9/g$b;",
            "Lz9/f2<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final d:Lr9/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/p<",
            "Lkotlinx/coroutines/internal/l0;",
            "Lj9/g$b;",
            "Lkotlinx/coroutines/internal/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/e0;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/i0;->a:Lkotlinx/coroutines/internal/e0;

    sget-object v0, Lkotlinx/coroutines/internal/i0$a;->o:Lkotlinx/coroutines/internal/i0$a;

    sput-object v0, Lkotlinx/coroutines/internal/i0;->b:Lr9/p;

    sget-object v0, Lkotlinx/coroutines/internal/i0$b;->o:Lkotlinx/coroutines/internal/i0$b;

    sput-object v0, Lkotlinx/coroutines/internal/i0;->c:Lr9/p;

    sget-object v0, Lkotlinx/coroutines/internal/i0$c;->o:Lkotlinx/coroutines/internal/i0$c;

    sput-object v0, Lkotlinx/coroutines/internal/i0;->d:Lr9/p;

    return-void
.end method

.method public static final a(Lj9/g;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lkotlinx/coroutines/internal/i0;->a:Lkotlinx/coroutines/internal/e0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lkotlinx/coroutines/internal/l0;

    if-eqz v0, :cond_1

    check-cast p1, Lkotlinx/coroutines/internal/l0;

    invoke-virtual {p1, p0}, Lkotlinx/coroutines/internal/l0;->b(Lj9/g;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    sget-object v1, Lkotlinx/coroutines/internal/i0;->c:Lr9/p;

    invoke-interface {p0, v0, v1}, Lj9/g;->v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lz9/f2;

    invoke-interface {v0, p0, p1}, Lz9/f2;->e(Lj9/g;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final b(Lj9/g;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lkotlinx/coroutines/internal/i0;->b:Lr9/p;

    invoke-interface {p0, v0, v1}, Lj9/g;->v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ls9/k;->b(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c(Lj9/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lkotlinx/coroutines/internal/i0;->b(Lj9/g;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lkotlinx/coroutines/internal/i0;->a:Lkotlinx/coroutines/internal/e0;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lkotlinx/coroutines/internal/l0;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/l0;-><init>(Lj9/g;I)V

    sget-object p1, Lkotlinx/coroutines/internal/i0;->d:Lr9/p;

    invoke-interface {p0, v0, p1}, Lj9/g;->v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    check-cast p1, Lz9/f2;

    invoke-interface {p1, p0}, Lz9/f2;->P(Lj9/g;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
