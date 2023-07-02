.class final Lj3/e$c;
.super Li3/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private s:La2/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La2/h$a<",
            "Lj3/e$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La2/h$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/h$a<",
            "Lj3/e$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Li3/m;-><init>()V

    iput-object p1, p0, Lj3/e$c;->s:La2/h$a;

    return-void
.end method


# virtual methods
.method public final x()V
    .locals 1

    iget-object v0, p0, Lj3/e$c;->s:La2/h$a;

    invoke-interface {v0, p0}, La2/h$a;->a(La2/h;)V

    return-void
.end method
