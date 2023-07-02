.class final Lkotlinx/coroutines/internal/i0$c;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/internal/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/p<",
        "Lkotlinx/coroutines/internal/l0;",
        "Lj9/g$b;",
        "Lkotlinx/coroutines/internal/l0;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Lkotlinx/coroutines/internal/i0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/internal/i0$c;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/i0$c;-><init>()V

    sput-object v0, Lkotlinx/coroutines/internal/i0$c;->o:Lkotlinx/coroutines/internal/i0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/coroutines/internal/l0;Lj9/g$b;)Lkotlinx/coroutines/internal/l0;
    .locals 1

    instance-of v0, p2, Lz9/f2;

    if-eqz v0, :cond_0

    check-cast p2, Lz9/f2;

    iget-object v0, p1, Lkotlinx/coroutines/internal/l0;->a:Lj9/g;

    invoke-interface {p2, v0}, Lz9/f2;->P(Lj9/g;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lkotlinx/coroutines/internal/l0;->a(Lz9/f2;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/internal/l0;

    check-cast p2, Lj9/g$b;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/internal/i0$c;->a(Lkotlinx/coroutines/internal/l0;Lj9/g$b;)Lkotlinx/coroutines/internal/l0;

    move-result-object p1

    return-object p1
.end method
