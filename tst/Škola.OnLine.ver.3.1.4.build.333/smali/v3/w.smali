.class public final synthetic Lv3/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/x$a;

.field public final synthetic o:Lx1/n1;

.field public final synthetic p:La2/i;


# direct methods
.method public synthetic constructor <init>(Lv3/x$a;Lx1/n1;La2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/w;->n:Lv3/x$a;

    iput-object p2, p0, Lv3/w;->o:Lx1/n1;

    iput-object p3, p0, Lv3/w;->p:La2/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv3/w;->n:Lv3/x$a;

    iget-object v1, p0, Lv3/w;->o:Lx1/n1;

    iget-object v2, p0, Lv3/w;->p:La2/i;

    invoke-static {v0, v1, v2}, Lv3/x$a;->i(Lv3/x$a;Lx1/n1;La2/i;)V

    return-void
.end method
