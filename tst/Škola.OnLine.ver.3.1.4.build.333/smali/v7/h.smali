.class public final synthetic Lv7/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv7/i;

.field public final synthetic o:Lx7/e;


# direct methods
.method public synthetic constructor <init>(Lv7/i;Lx7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/h;->n:Lv7/i;

    iput-object p2, p0, Lv7/h;->o:Lx7/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv7/h;->n:Lv7/i;

    iget-object v1, p0, Lv7/h;->o:Lx7/e;

    invoke-static {v0, v1}, Lv7/i;->g(Lv7/i;Lx7/e;)V

    return-void
.end method
