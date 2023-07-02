.class public final synthetic Lv3/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/x$a;

.field public final synthetic o:La2/e;


# direct methods
.method public synthetic constructor <init>(Lv3/x$a;La2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/p;->n:Lv3/x$a;

    iput-object p2, p0, Lv3/p;->o:La2/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv3/p;->n:Lv3/x$a;

    iget-object v1, p0, Lv3/p;->o:La2/e;

    invoke-static {v0, v1}, Lv3/x$a;->a(Lv3/x$a;La2/e;)V

    return-void
.end method
