.class final Lz9/o1;
.super Lz9/v1;
.source ""


# instance fields
.field private final r:Lr9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/l<",
            "Ljava/lang/Throwable;",
            "Lg9/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr9/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg9/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lz9/v1;-><init>()V

    iput-object p1, p0, Lz9/o1;->r:Lr9/l;

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lz9/o1;->r:Lr9/l;

    invoke-interface {v0, p1}, Lr9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lz9/o1;->C(Ljava/lang/Throwable;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1
.end method
