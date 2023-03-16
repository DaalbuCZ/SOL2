.class Ls0/o$c;
.super Ly/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/o;-><init>(Landroidx/room/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ls0/o;


# direct methods
.method constructor <init>(Ls0/o;Landroidx/room/h;)V
    .locals 0

    iput-object p1, p0, Ls0/o$c;->d:Ls0/o;

    invoke-direct {p0, p2}, Ly/d;-><init>(Landroidx/room/h;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM WorkProgress"

    return-object v0
.end method
