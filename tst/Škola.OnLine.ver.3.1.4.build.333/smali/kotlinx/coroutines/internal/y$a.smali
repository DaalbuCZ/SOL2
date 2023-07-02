.class final Lkotlinx/coroutines/internal/y$a;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/internal/y;->a(Lr9/l;Ljava/lang/Object;Lj9/g;)Lr9/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/l<",
        "Ljava/lang/Throwable;",
        "Lg9/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Lr9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/l<",
            "TE;",
            "Lg9/s;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic p:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic q:Lj9/g;


# direct methods
.method constructor <init>(Lr9/l;Ljava/lang/Object;Lj9/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/l<",
            "-TE;",
            "Lg9/s;",
            ">;TE;",
            "Lj9/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/internal/y$a;->o:Lr9/l;

    iput-object p2, p0, Lkotlinx/coroutines/internal/y$a;->p:Ljava/lang/Object;

    iput-object p3, p0, Lkotlinx/coroutines/internal/y$a;->q:Lj9/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lkotlinx/coroutines/internal/y$a;->o:Lr9/l;

    iget-object v0, p0, Lkotlinx/coroutines/internal/y$a;->p:Ljava/lang/Object;

    iget-object v1, p0, Lkotlinx/coroutines/internal/y$a;->q:Lj9/g;

    invoke-static {p1, v0, v1}, Lkotlinx/coroutines/internal/y;->b(Lr9/l;Ljava/lang/Object;Lj9/g;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/y$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1
.end method
