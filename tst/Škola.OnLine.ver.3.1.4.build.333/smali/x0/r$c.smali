.class Lx0/r$c;
.super Lc0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/r;-><init>(Landroidx/room/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lx0/r;


# direct methods
.method constructor <init>(Lx0/r;Landroidx/room/h;)V
    .locals 0

    iput-object p1, p0, Lx0/r$c;->d:Lx0/r;

    invoke-direct {p0, p2}, Lc0/d;-><init>(Landroidx/room/h;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE workspec SET output=? WHERE id=?"

    return-object v0
.end method
