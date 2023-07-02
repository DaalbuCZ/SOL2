.class Li3/f$a;
.super Li3/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li3/f;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic s:Li3/f;


# direct methods
.method constructor <init>(Li3/f;)V
    .locals 0

    iput-object p1, p0, Li3/f$a;->s:Li3/f;

    invoke-direct {p0}, Li3/m;-><init>()V

    return-void
.end method


# virtual methods
.method public x()V
    .locals 1

    iget-object v0, p0, Li3/f$a;->s:Li3/f;

    invoke-static {v0, p0}, Li3/f;->f(Li3/f;Li3/m;)V

    return-void
.end method
