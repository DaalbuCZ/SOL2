.class Li3/g$a;
.super Li3/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li3/g;->y()Li3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic s:Li3/g;


# direct methods
.method constructor <init>(Li3/g;)V
    .locals 0

    iput-object p1, p0, Li3/g$a;->s:Li3/g;

    invoke-direct {p0}, Li3/m;-><init>()V

    return-void
.end method


# virtual methods
.method public x()V
    .locals 1

    iget-object v0, p0, Li3/g$a;->s:Li3/g;

    invoke-static {v0, p0}, Li3/g;->w(Li3/g;La2/h;)V

    return-void
.end method
