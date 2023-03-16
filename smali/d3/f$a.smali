.class Ld3/f$a;
.super Ld3/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld3/f;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic s:Ld3/f;


# direct methods
.method constructor <init>(Ld3/f;)V
    .locals 0

    iput-object p1, p0, Ld3/f$a;->s:Ld3/f;

    invoke-direct {p0}, Ld3/m;-><init>()V

    return-void
.end method


# virtual methods
.method public x()V
    .locals 1

    iget-object v0, p0, Ld3/f$a;->s:Ld3/f;

    invoke-static {v0, p0}, Ld3/f;->f(Ld3/f;Ld3/m;)V

    return-void
.end method
