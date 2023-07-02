.class Lx0/o$b;
.super Lc0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/o;-><init>(Landroidx/room/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lx0/o;


# direct methods
.method constructor <init>(Lx0/o;Landroidx/room/h;)V
    .locals 0

    iput-object p1, p0, Lx0/o$b;->d:Lx0/o;

    invoke-direct {p0, p2}, Lc0/d;-><init>(Landroidx/room/h;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE from WorkProgress where work_spec_id=?"

    return-object v0
.end method
