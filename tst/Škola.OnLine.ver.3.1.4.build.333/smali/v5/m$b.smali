.class Lv5/m$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv5/m;->k(Lc6/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lc6/i;

.field final synthetic o:Lv5/m;


# direct methods
.method constructor <init>(Lv5/m;Lc6/i;)V
    .locals 0

    iput-object p1, p0, Lv5/m$b;->o:Lv5/m;

    iput-object p2, p0, Lv5/m$b;->n:Lc6/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lv5/m$b;->o:Lv5/m;

    iget-object v1, p0, Lv5/m$b;->n:Lc6/i;

    invoke-static {v0, v1}, Lv5/m;->a(Lv5/m;Lc6/i;)Ly4/i;

    return-void
.end method
