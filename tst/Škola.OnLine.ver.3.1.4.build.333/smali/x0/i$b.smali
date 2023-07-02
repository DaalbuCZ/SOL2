.class Lx0/i$b;
.super Lc0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/i;-><init>(Landroidx/room/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lx0/i;


# direct methods
.method constructor <init>(Lx0/i;Landroidx/room/h;)V
    .locals 0

    iput-object p1, p0, Lx0/i$b;->d:Lx0/i;

    invoke-direct {p0, p2}, Lc0/d;-><init>(Landroidx/room/h;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM SystemIdInfo where work_spec_id=?"

    return-object v0
.end method
