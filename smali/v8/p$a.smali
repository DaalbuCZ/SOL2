.class Lv8/p$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll8/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8/p;->m(Ls1/r;Lv8/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lv8/o;

.field final synthetic o:Lv8/p;


# direct methods
.method constructor <init>(Lv8/p;Lv8/o;)V
    .locals 0

    iput-object p1, p0, Lv8/p$a;->o:Lv8/p;

    iput-object p2, p0, Lv8/p$a;->n:Lv8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ll8/d$b;)V
    .locals 0

    iget-object p1, p0, Lv8/p$a;->n:Lv8/o;

    invoke-virtual {p1, p2}, Lv8/o;->f(Ll8/d$b;)V

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lv8/p$a;->n:Lv8/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lv8/o;->f(Ll8/d$b;)V

    return-void
.end method
