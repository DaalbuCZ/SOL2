.class public final Ly/a$a;
.super Ly/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Ly/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly/a$a;

    invoke-direct {v0}, Ly/a$a;-><init>()V

    sput-object v0, Ly/a$a;->b:Ly/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly/a;-><init>()V

    return-void
.end method
