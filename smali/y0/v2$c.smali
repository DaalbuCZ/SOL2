.class Ly0/v2$c;
.super Ly0/r0$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/v2;->a()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Ly0/v2;


# direct methods
.method constructor <init>(Ly0/v2;[Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Ly0/v2$c;->o:Ly0/v2;

    invoke-direct {p0, p2}, Ly0/r0$a;-><init>([Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/io/File;Ljava/lang/Long;Ljava/io/File;Ljava/lang/Long;)I
    .locals 0

    invoke-virtual {p2, p4}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
