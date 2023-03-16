.class final Lkotlinx/coroutines/internal/y$a;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/internal/y;->a(Lj9/l;Ljava/lang/Object;Lb9/g;)Lj9/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/l<",
        "Ljava/lang/Throwable;",
        "Ly8/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Lj9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/l<",
            "TE;",
            "Ly8/s;",
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

.field final synthetic q:Lb9/g;


# direct methods
.method constructor <init>(Lj9/l;Ljava/lang/Object;Lb9/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/l<",
            "-TE;",
            "Ly8/s;",
            ">;TE;",
            "Lb9/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/internal/y$a;->o:Lj9/l;

    iput-object p2, p0, Lkotlinx/coroutines/internal/y$a;->p:Ljava/lang/Object;

    iput-object p3, p0, Lkotlinx/coroutines/internal/y$a;->q:Lb9/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lkotlinx/coroutines/internal/y$a;->o:Lj9/l;

    iget-object v0, p0, Lkotlinx/coroutines/internal/y$a;->p:Ljava/lang/Object;

    iget-object v1, p0, Lkotlinx/coroutines/internal/y$a;->q:Lb9/g;

    invoke-static {p1, v0, v1}, Lkotlinx/coroutines/internal/y;->b(Lj9/l;Ljava/lang/Object;Lb9/g;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/y$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ly8/s;->a:Ly8/s;

    return-object p1
.end method
