.class public Ly0/z$c;
.super Ly0/z$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Ly0/z$b;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Ly0/z$b;->d:Landroid/content/Context;

    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {p1, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v1, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    iput-wide v1, p0, Ly0/z$b;->c:J

    iget-wide v0, v0, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    iput-wide v0, p0, Ly0/z$b;->b:J

    return-void
.end method


# virtual methods
.method public c()J
    .locals 4

    iget-wide v0, p0, Ly0/z$b;->b:J

    iget-wide v2, p0, Ly0/z$b;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Ly0/z$b;->b:J

    return-wide v0
.end method
