.class public final Lz1/v$a;
.super Ljava/lang/Exception;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final n:Lx1/n1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lx1/n1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lz1/v$a;->n:Lx1/n1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Lx1/n1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lz1/v$a;->n:Lx1/n1;

    return-void
.end method
