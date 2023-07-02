.class Ld9/p$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld9/p;->m(Lx1/s;Ld9/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ld9/o;

.field final synthetic o:Ld9/p;


# direct methods
.method constructor <init>(Ld9/p;Ld9/o;)V
    .locals 0

    iput-object p1, p0, Ld9/p$a;->o:Ld9/p;

    iput-object p2, p0, Ld9/p$a;->n:Ld9/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lt8/d$b;)V
    .locals 0

    iget-object p1, p0, Ld9/p$a;->n:Ld9/o;

    invoke-virtual {p1, p2}, Ld9/o;->f(Lt8/d$b;)V

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Ld9/p$a;->n:Ld9/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ld9/o;->f(Lt8/d$b;)V

    return-void
.end method
